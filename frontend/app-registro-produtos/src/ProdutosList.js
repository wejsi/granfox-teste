import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';

class ProdutoList extends Component {

    constructor(props) {
        super(props);
        this.state = {produtos: []};
        this.remove = this.remove.bind(this);
    }

    componentDidMount() {
        fetch('/produtos')
            .then(response => response.json())
            .then(data => this.setState({produtos: data}));
    }

    async remove(id) {
        await fetch(`/produtos/${id}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }).then(() => {
            let updatedProdutos = [...this.state.produtos].filter(i => i.id !== id);
            this.setState({produtos: updatedProdutos});
        });
    }

    render() {
        const {produtos} = this.state;

        const produtoList = produtos.map(produto => {
            return <tr key={produto.id}>
                <td style={{whiteSpace: 'nowrap'}}>{produto.name}</td>
                <td>{produto.email}</td>
                <td>
                    <ButtonGroup>
                        <Button size="sm" color="primary" tag={Link} to={"/produtos/" + produto.id}>Edit</Button>
                        <Button size="sm" color="danger" onClick={() => this.remove(produto.id)}>Delete</Button>
                    </ButtonGroup>
                </td>
            </tr>
        });

        return (
            <div>
                <AppNavbar/>
                <Container fluid>
                    <div className="float-right">
                        <Button color="success" tag={Link} to="/produtos/new">Add Produto</Button>
                    </div>
                    <h3>Produtos</h3>
                    <Table className="mt-4">
                        <thead>
                        <tr>
                            <th width="30%">Name</th>
                            <th width="30%">Descrição</th>
                            <th width="40%">Quantidade</th>
                            <th width="40%">Preço</th>
                        </tr>
                        </thead>
                        <tbody>
                        {produtoList}
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}

export default ProdutoList;