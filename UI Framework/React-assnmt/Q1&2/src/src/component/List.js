import React from 'react'
function List({detail})
{
    return(
        <div>
            <h6>{detail.name} {detail.job}</h6>
        </div>
    )
}
export default List
