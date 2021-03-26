import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

version = "2020.2"

project {  
  name = "Read only DSL demo"
  
  buildType{
    id("Hello")
    name = "Hello"

    steps {
        script {
            scriptContent = "Hello world!"
        }
    }
  }
  
}

