addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.0.1")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.10.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.10")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.0")
addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.1.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.1.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.7.1")
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.5")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
