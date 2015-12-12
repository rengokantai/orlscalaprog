var arr1 = Array(1,2,3,4)
var arr2 = Array(5,6)

//left associative
arr1++:arr2
//same as
arr1.++(arr2)
//right associative
arr1.++:(arr2)
//same as
arr1 ++ arr2

2 +: arr1 :+ 2
arr1.tail//except first element
arr1.take(2)//take first n elements
var(b,a)=arr1.splitAt(2)

var sli = arr1.slice(1,3)
arr1.nonEmpty
arr1.startsWith(Array(1,2))
arr1.endsWith(Array(1,2))
arr1.indexOf(2)
arr1.product
arr1.par

arr1.patch(1,Array(7,8,9,10),1)

var lst = List(1,2)
lst.toVector
lst.updated(1,100)//lst(1)=100,generate a new list

