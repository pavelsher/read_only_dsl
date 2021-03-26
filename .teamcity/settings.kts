import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

version = "2020.2"

project {  
  
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

