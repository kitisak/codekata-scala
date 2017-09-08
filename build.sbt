lazy val fizzBuzz = (project in file("fizz-buzz")).
  settings(Settings.settings: _*).
  settings(libraryDependencies ++= Dependencies.testDependencies)


lazy val cakePattern = (project in file("cake-pattern")).
  settings(Settings.settings: _*).
  settings(libraryDependencies ++= Dependencies.testDependencies)


lazy val primeNumber = (project in file("prime-number")).
  settings(Settings.settings: _*).
  settings(libraryDependencies ++= Dependencies.testDependencies)


lazy val romanNumerals = (project in file("roman-numerals")).
  settings(Settings.settings: _*).
  settings(libraryDependencies ++= Dependencies.testDependencies)


/*lazy val tennisScoring = (project in file("tennis-scoring")).
  settings(Settings.settings: _*).
  settings(libraryDependencies ++= Dependencies.testDependencies )
*/

lazy val root = (project in file(".")).aggregate(fizzBuzz, cakePattern, primeNumber, romanNumerals /*, tennisScoring*/)