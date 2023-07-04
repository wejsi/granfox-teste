import React, { Component } from 'react';
import './App.css';
import Home from './Home';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ProdutosList from './ProdutosList';
import ProdutoEdit from "./ProdutoEdit";

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/produtos' exact={true} component={ProdutosList}/>
            <Route path='/produtos/:id' component={ProdutoEdit}/>
          </Switch>
        </Router>
    )
  }
}

export default App;