import React from "react";

const Deleterow = ({ employee, handleDeleteClick }) => {
  return (
    <tr>
     <td>
        <button type="button" onClick={() => handleDeleteClick(employee.id)}>
          Delete
        </button>
      </td>
      </tr>
    
  );
};

export default Deleterow;