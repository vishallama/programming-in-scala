// Ordinary sum and curried sum

def plainOldSum(x: Int, y: Int): Int = x + y
plainOldSum(1, 2)

def curriedSum(x: Int)(y: Int): Int = x + y
curriedSum(1)(2)
val onePlus = curriedSum(1)_
onePlus(2)

def first(x: Int) = (y: Int) => x + y
val second = first(1)
second(2)
