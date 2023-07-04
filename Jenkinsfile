pipeline {

    agent {
        node {
            label 'docker'
        }
    }
   
    environment {
        IMAGE = readMavenPom().getArtifactId()
        VERSION = readMavenPom().getVersion()
    }

    stages {
        stage('Build') {
            agent {
                docker {
                    reuseNode true
                    image 'maven:3.5.0-jdk-8'
                }
            }
            steps {
                withMaven(options: [findbugsPublisher(), junitPublisher(ignoreAttachments: false)]) {
                    sh 'mvn clean findbugs:findbugs package'
                }
            }
            post {
                success {
                  
                    archiveArtifacts(artifacts: '**/target/*.jar', allowEmptyArchive: true)
                }
            }
        }

        stage('Quality Analysis') {
            parallel {
               stage('Integration Test') {
                    agent any 
                    steps {
                        echo 'Executará os testes integrados...'
                    }
                }
                stage('Sonar Scan') {
                    agent {
                        docker {
                             reuseNode true
                            image 'maven:3.5.0-jdk-8'
                        }
                    }
                    environment {                       
                        SONAR = credentials('sonar')
                    }
                    steps {
                        sh 'mvn sonar:sonar -Dsonar.login=$SONAR_PSW'
                    }
                }
            }
        }

        stage('Build Deploy') {
            when {
                branch 'main'  //Stage responsavel pelo deploy da imegem de origem na main
            }
            steps {
               
                sh """
          docker build -t ${IMAGE} .
          docker tag ${IMAGE} ${IMAGE}:${VERSION}
          docker push ${IMAGE}:${VERSION}
        """
            }
        }
    }

    post {
        failure {
            // em caso de falhas configurar emails responsavel
            mail to: 'weslen.developed.si@gmail.com',
                    subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                    body: "Something is wrong with ${env.BUILD_URL}"
        }
    }
}
