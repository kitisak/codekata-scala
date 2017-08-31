resolvers ++= Seq(
  Classpaths.typesafeReleases,
  "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
