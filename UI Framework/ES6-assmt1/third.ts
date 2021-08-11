let Order={
    id:1001,
   title:"starwars",
   price:500
   };
  function printOrder()
   {
    document.write("Order details :"+Order.id+" "+Order.title+" "+Order.price);
   }
    function getPrice()
    {
    return Order.price;
    }
   var Book=Object.assign(Order);
   printOrder();
   document.write("<br>");
   document.write( getPrice());
   document.write("<br>");
   document.write(Book.id+" "+Book.title+" "+Book.price);
  
  