class Calculator {
   def addAllGroovy( Object[] args ){
      int total = 0
      for( i in args ) { total += i }
      total
   }
   def addAllJava( int... args ){
      int total = 0
      for( i in args ) { total += i }
      total
   }
}

Calculator c = new Calculator()
assert c.addAllGroovy(1,2,3,4,5) == 10
assert c.addAllJava(1,2,3,4,5) == 10
