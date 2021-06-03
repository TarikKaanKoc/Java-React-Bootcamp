 class Customer{
 // export = javada public 

        // prototyping özelliği. Değerler aşağıdaki cunstructor 'da oluşturulur. 
    constructor(id,customerNumber){
        this.id = id
        this.customerNumber = customerNumber
    }
} 

let customer = new Customer(1,"12345");
//prototyping
customer.name = "Tarık Kaan Koç"
console.log(customer.name) // insteanse'ye yapılan prototyping

Customer.blabla = "Example" // Classa yapılan prototyping
console.log(Customer.blabla)

console.log(customer.customerNumber)

class IndividualCustomer extends Customer{
    cunstructor(firstName,id,customerNumber){
        super(id,customerNumber) 
        this.firstName = firstName
    }

}

class CorporateCustomer extends Customer{
    cunstructor(companyName,id,customerNumber){
        super(id,customerNumber)
        this.companyName = companyName 
    }
}