
           let arr=["Tom","Ivan","jerry"];
           for(let i of arr)
           {
            document.write("<br>");
            document.write("[{");
            
               var a= () =>" name: "+i+" length "+i.length;
               document.write(a()+",");
             }
             document.write("}]");