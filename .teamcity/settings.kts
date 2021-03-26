import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

version = "2020.2"

project {  
  
  buildType{
    name = "Hello"

    steps {
        script {
            scriptContent = "Hello!"
        }
    }
  }
  
}

