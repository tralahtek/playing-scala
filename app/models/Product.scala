package models
case class Product(
  var id:Option[Long],
  var name:String,
  var details:String,
  var price:BigDecimal
){
  override def toString:String={
    s"Product { id:${id.getOrElse(0)} ,name: $name ,details: $details , price: $price }"
  }
}
