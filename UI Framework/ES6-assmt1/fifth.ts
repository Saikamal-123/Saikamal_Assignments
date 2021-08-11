function add(a=20,b=30)
{
    document.write("a= "+a+" b= "+b)
}
add();

function userFriends(username,[...friends])
{
    document.writeln(" username is "+username+" this friends are "+friends);
}

userFriends("kamal",["purna","pavan","krishna"]);
function printCapitalName(...name)
{
    return name;
    
}
document.write(" "+printCapitalName("kamal","purna","pavan","krishna","sai"));