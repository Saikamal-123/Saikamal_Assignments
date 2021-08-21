import logo from './logo.svg';
import './App.css';
//import '/mycomponent/second.js'
//import Tables from './mycomponent/second';
//import './mycomponent/second.js'
//import tables from './mycomponent/second2';
import Mytable from './component/mytable';


function App() {
  return (
    <div>
    
     <table>
        <th><td>Name          </td></th>
        <th><td>Job desc</td></th>
        <tr>
          <td width="200px"> <Mytable names="kamal"/></td>
          <td>  <Mytable job="engineer"/></td>
        </tr>
        <tr>
          <td> <Mytable names="purna"/></td>
          <td>  <Mytable job="engineer"/></td>
        </tr>
        <tr>
          <td> <Mytable names="sai"/></td>
           <td>  <Mytable job="mechanic"/></td>
        </tr>
        <tr>
          <td> <Mytable names="john"/></td>
           <td>  <Mytable job="contactor"/></td>
        </tr>
     </table>
     

    </div>
        
        
       
     
  );
}

export default App;
