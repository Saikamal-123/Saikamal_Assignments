import logo from './logo.svg';
import './App.css';
import { nanoid } from "nanoid";
import {useState} from 'react';
import data from "./data.json";
import Deleterow from './components/Deleterow';

function App() {
   const [employee, setEmployee] = useState(data);
   const [addFormData, setAddFormData] = useState({
    name: "",
    role: ""
   
  })
  

  const handleAddFormChange = (event) => {
   

    const name = event.target.getAttribute("name");
    const fieldValue = event.target.value;

    const newFormData = { ...addFormData };
    newFormData[name] = fieldValue;

    setAddFormData(newFormData);
  };
  const handleAddFormSubmit = (event) => {
    event.preventDefault();

    const newEmployee = {
      id: nanoid(),
      name: addFormData.name,
      role: addFormData.role,
      
    };

    const newEmployees = [...employee, newEmployee];
    setEmployee(newEmployees);
  };
  const handleDeleteClick = (empId) => {
    const newEmployees = [...employee];

    const index = employee.findIndex(() => employee.id === empId);

    newEmployees.splice(index, 1);

    setEmployee(newEmployees);
  };
  return (
    <div className="App">
            <form onSubmit={handleAddFormSubmit}>
      <table>
          <thead>
            <tr>
              <th>Name</th>
              <th>Role</th>
              <th>Delete</th>
            </tr>
          </thead>
          <tbody>
            {employee.map((emp)=>(
              <tr>
                <td>{emp.name}</td>
                <td>{emp.role}</td>
                <td>
              <Deleterow
            employee={employee}
             handleDeleteClick={handleDeleteClick}/>
              </td>
              </tr>
            ))}
        
             
         
            </tbody>
            
          </table>
          <h2>Add an employee</h2>

        <input
          type="text"
          name="name"
          required="required"
          placeholder="Enter a name..."
          onChange={handleAddFormChange}
        />
        <input
          type="text"
          name="role"
          required="required"
          placeholder="Enter the role..."
          onChange={handleAddFormChange}
        />
        
        <button type="submit">Add</button>
    </form>
    </div>
  );
};

    




export default App;
