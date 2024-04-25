# My Shared Library

This repository serves as a shared library for storing Jenkinsfiles and reusable functions.

## Description

The purpose of this repository is to centralize Jenkinsfiles and common functions that can be reused across multiple projects or pipelines. By maintaining a shared library, you can streamline pipeline development, reduce duplication, and ensure consistency across your Jenkins projects.

## Usage

### Jenkinsfiles

Jenkinsfiles are stored in the `jenkinsfiles` directory. These Jenkinsfiles can be referenced directly from your Jenkins pipelines using the `@Library` directive.

Example:

```groovy
@Library('my-shared-library') import com.example.pipeline.MyPipeline

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    // Call the pipeline defined in MyPipeline.groovy
                    MyPipeline.build()
                }
            }
        }
    }
}
```

## Functions

Reusable functions are stored in the src directory. These functions can be imported and used in your Jenkinsfiles as needed.

Example:

```groovy
@Library('my-shared-library') import com.example.functions

pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                script {
                    // Call a reusable function
                    functions.myFunction()
                }
            }
        }
    }
}
```

###Contribution
Contributions to this shared library are welcome! If you have Jenkinsfiles or functions that you believe could benefit others, feel free to submit a pull request.
