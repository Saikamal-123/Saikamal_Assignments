class Account{
    id;
    name;
    balance;
    constructor(id,name,balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

}
class SavingsAccount extends Account{
    intrest;
    cashcredit;
    constructor(intrest,cashcredit)
    {
        super(10,"kamal",500);
        this.intrest=intrest;
        this.cashcredit=cashcredit;
    }
}
class CurruntAccount extends Account{
    intrest;
    cashcredit;
    constructor(intrest,cashcredit)
    {
        super(10,"kamal",500);
        this.intrest=intrest;
        this.cashcredit=cashcredit;
    }
   
}
let acc=new Account(20,"kamal",50000);
document.write("Bank Details "+acc.id+" "+acc.name+" "+acc.balance);
let sav=new SavingsAccount(5,500);
let cur=new CurruntAccount(3,600);
function totalSavings() {
    return acc.balance+(sav.intrest*sav.cashcredit);
    
}
function totalCurrent() {
    return acc.balance+(cur.intrest*cur.cashcredit);
    
}
document.write("<br>");
document.write("Savings account "+totalSavings());
document.write("<br>");
document.write("Current account "+totalCurrent());
