# Funcitonal Programming

## What is funcitonal programming

it's programming with functions!

### Let's create some functions!

```scala
def findSymbol(symbol: String, line: String): Boolean = line.contains(symbol)
def findSEverywhere(line: String): Boolean = line.contains("S")
```
#### Currying
```scala
def findSymbol(symbol: String)(line: String): Boolean = line.contains(symbol)
def findSEverywhere: String => Boolean = findSymbol("S")
```

#### Dependency injection with currying
```scala
trait DB {
  def getConnection(): String
}

case class RealDB() extends DB {
  override def getConnection(): String = "real"
}

case class Noop() extends DB {
  override def getConnection(): String = "noop"
}

type Customer = String

def getCustomerById(db: DB)(id: Int): Customer = {
  "such customer"
}

val noopStuff = getCustomerById(Noop()) _ 

```

#### Imutability
```scala

stuff.foldLeft[String]("a")((acc, el) => if (el>3) acc + toString(el) else acc)

```

#### Partial functions

#### Intro to monads

#### Monadic composition

