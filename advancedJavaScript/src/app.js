 // var,  let , const -veriables

    //Örnek1:    // elesticSearch
    let number1 =10;
    number1 = "Tarık Kaan Koç"
    let student = {id:1,name: "Kaan"}
  //  console.log(student)

    function save(puan=10, ogrenci) {
        //console.log(ogrenci.name+ " : "+ puan)
    }
    save(undefined,student);

    // Tip güvenli bir dil değil js.

    //Arry

    let students = ["Tarık kaan koc","Abdulhakim kaya","Furkan Zmn","Büşra","Ankara",{city:"istanbul"}]

  //  console.log(students)

    let students2 = [student,{id:1, name: "Koç"}]
    //    console.log(students2)

    // rest - (geriye kalan) 
    let showProducts = function (id,...products) {
        console.log(id)
        console.log(products[0]) // 0. Elamanı okut. Çıktı: Elma
    }

    // typeof en son aldığı değeri okutur 
 //   console.log(typeof showProducts)
    //rest 
 //  showProducts(10,"elma","armut","karpuz");

  //... spread  verision
  // spread : ayrıştırmask

  let points= [1,2,3,4,50,4,60,14] 
  console.log(...points)
  console.log(Math.max(...points))
  console.log(..."ABC","D",..."EFG","H")

    // Destructring : parçalamak anlamına gelmektedir

    // Eliimizdeki array'n değerlerini değişkenklere atamak 

    let populations = [10000,20000,30000,[40000,50000]]

    let [small,medium,high,[veryhigh,maximum]] = populations // Destructring 

    console.log(small)
    console.log(medium)
    console.log(high)
    console.log(veryhigh)
    console.log(maximum)
   
    

    // Örnek 2 : Destrcutring 

    function someFunction([small1],number) {
        console.log(small1) // Bana bir arry gelecek ve arry 'deki ilk değişkeni small1'e atayacam demektir. 
    }

    someFunction(populations); // Çıktı : 10000

    let category = {id:1,name:"içecek"}
    console.log(category.id) // Java'da gibi getId olarak düşünüebilirsiniz
    console.log(category["name"]) // java'da gibi getName olarak düşünebilirsiniz. Çalışır. 

    let {id,name} = category
    console.log(id) 
    console.log(name)