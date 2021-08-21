
import React, {Component} from 'react';
import Button from './Button';
import './Calculator.css';
import Display from './Display';
import Keypad from './Keypad';

class Calculator extends Component {
    constructor() {
        super();
        this.state = { data: ''}
    }

    calculate = () => {
        try {
            const result = eval(this.state.data);
            this.setState({data: result});
        } catch (e) {
            this.setState({data: 'error'})
        }
    }

    handleClick = e => {
        const value = e.target.getAttribute('data-value');
        switch(value) {
            case 'clear':
                this.setState({ data: ''});
                break;
            case 'equal':
                this.calculate();
                break;
            default:
                this.setState({ data: this.state.data + value});
        }
    }
    render(){
        return(
            <div className="Calculator">
                <Display data={this.state.data}/>
                <Keypad>
                    <table>
                        <tr>
                           
                            <th class="clear"> <Button onClick={this.handleClick} min-width="100%" label="C" value="clear" />     </th>
                           
                            
                        </tr>
                        
                        <tr>
                            <td><Button onClick={this.handleClick} label="1" value="1" /></td>
                            <td> <Button onClick={this.handleClick} label="2" value="2" /></td>
                            <td> <Button onClick={this.handleClick} label="3" value="3" /></td>
                            
                            <td><Button onClick={this.handleClick} label="+" value="+" /></td>
                        </tr>
                        <tr>
                            <td><Button onClick={this.handleClick} label="4" value="4" /></td>
                            <td> <Button onClick={this.handleClick} label="5" value="5" /></td>
                            <td> <Button onClick={this.handleClick} label="6" value="6" /></td>
                            
                            <td><Button onClick={this.handleClick} label="-" value="-" /></td>
                        </tr>
                        <tr>
                            <td><Button onClick={this.handleClick} label="7" value="7" /></td>
                            <td> <Button onClick={this.handleClick} label="8" value="8" /></td>
                            <td> <Button onClick={this.handleClick} label="9" value="9" /></td>
                            
                            <td><Button onClick={this.handleClick} label="x" value="*" /></td>
                        </tr>
                        <tr>
                            <td><Button onClick={this.handleClick} label="0" value="0" /></td>
                            <td> <Button onClick={this.handleClick} label="." value="." /></td>
                           <td> <Button onClick={this.handleClick} label="=" value="equal" /></td>
                           <td> <Button onClick={this.handleClick} label="/" value="/" /></td>
                        </tr>
                        
                    </table>

                    
                </Keypad>
            </div>
        );
    }
}

export default Calculator;