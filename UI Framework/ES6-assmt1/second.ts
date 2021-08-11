function func()
{
 let a=10;
    if(a==10)
    {
        let a=20;//this variable is block-scoped
        document.write("a is "+a);
    }
    else
    {
     document.write("a is not "+a);
    }
    document.write("<br>");
    document.write("outside if block ");
    document.write(a);//10
}
func();