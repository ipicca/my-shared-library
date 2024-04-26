// PIPELINE: _pipeline_iis_apps_clonar_loan_homologacion
@Library('my-shared-library') _

pipeline {
    agent any

    parameters {
        string(
            name: 'CLIENTE_SUCURSAL',
            defaultValue: "${env.CLIENTE_SUCURSAL}",
            trim: true
        )
        string(
            name: 'SISTEMA_ENTORNO',
            defaultValue: 'loan-homologacion',
            trim: true
        )
    }

    stages {
        stage('CLONAR APP: autogestionada') {
            steps {
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\autogestionada")
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\autogestionada")
                /*
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\autogestionada",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\autogestionada",
                    "/MIR /FFT /Z /xjd /XA:H /W:5 /Xd __changelog__ /Xf Web.config Web.config.bak myapp.log",
                )
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\autogestionada\\Views",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\autogestionada\\Views",
                    "/MIR /FFT /Z /xjd /XA:H /W:5",
                )
                */
            }
        }
        stage('CLONAR APP: ecommerce') {
            steps {
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\ecommerce")
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\ecommerce")
                /*
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\ecommerce",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\ecommerce",
                    "/MIR /FFT /Z /xjd /XA:H /W:5 /Xd __changelog__ /Xf Web.config Web.config.bak myapp.log",
                )
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\ecommerce\\Views",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\ecommerce\\Views",
                    "/MIR /FFT /Z /xjd /XA:H /W:5",
                )
                */
            }
        }
        stage('CLONAR APP: serviciosapi') {
            steps {
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\serviciosapi")
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\serviciosapi")
                /*
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\serviciosapi",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\serviciosapi",
                    "/MIR /FFT /Z /xjd /XA:H /W:5 /Xd __changelog__ /Xf Web.config Web.config.bak myapp.log *.log",
                )
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\serviciosapi\\Views",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\serviciosapi\\Views",
                    "/MIR /FFT /Z /xjd /XA:H /W:5",
                )
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\serviciosapi\\Areas\\HelpPage\\Views",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\serviciosapi\\Areas\\HelpPage\\Views",
                    "/MIR /FFT /Z /xjd /XA:H /W:5",
                )
                */
            }
        }
        stage('CLONAR APP: servicioswcf') {
            steps {
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\servicioswcf")
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\servicioswcf")                
                /*
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\servicioswcf",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\servicioswcf",
                    "/MIR /FFT /Z /xjd /XA:H /W:5 /Xd __changelog__ /Xf Web.config Web.config.bak myapp.log",
                )
                */
            }
        }
        stage('CLONAR APP: serviciosweb') {
            steps {
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\serviciosweb")
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\serviciosweb")
                /*
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\serviciosweb",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\serviciosweb",
                    "/MIR /FFT /Z /xjd /XA:H /W:5 /Xd __changelog__ /Xf Web.config Web.config.bak myapp.log *.log",
                )
                */
            }
        }
        stage('CLONAR APP: web') {
            steps {
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\web")
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\web")                
                /*
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\web",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\web",
                    "/MIR /FFT /Z /xjd /XA:H /W:5 /Xd __changelog__ /Xf _archivos Web.config Web.config.bak",
                )
                */
            }
        }
        stage('CLONAR APP: windows') {
            steps {
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\windows")
                echo("C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\windows")
                /*
                robocopy(
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\loan-produccion\\windows",
                    "C:\\inetpub\\wwwroot\\${params.CLIENTE_SUCURSAL}\\${params.SISTEMA_ENTORNO}\\windows",
                    "/MIR /FFT /Z /xjd /XA:H /W:5 /Xd __changelog__ /Xf Procesos.exe.config Procesos.exe.config.bak",
                )
                */
            }
        }
    }
    post {
        always {
             echo 'Finalizado.'
        }
        success {
            echo 'Exitoso.'
        }  
        failure {
            echo "Error!"
            // build job: 'telegram_send_message', parameters: [text(name: 'text', value: "*${env.CLIENTE}* ``` ERROR - ${env.JOB_NAME}-${env.BUILD_NUMBER} ```"), string(name: 'status', value: 'bad')]
            sendEmails(env.CLIENTE, env.JOB_NAME, env.BUILD_NUMBER, env.MAILS)
        }
        unstable {
            echo 'Inestable!'
        }
        changed {
            echo 'El estado ha cambiado.'
        }
    }
}

// [Return codes that are used by the Robocopy utility](https://learn.microsoft.com/en-us/troubleshoot/windows-server/backup-and-storage/return-codes-used-robocopy-utility)
// [ROBOCOPY Exit Codes](https://ss64.com/nt/robocopy-exit.html)
// [Jenkins - simply robocopy in Jenkins finishes marks build with failure](https://stackoverflow.com/a/46003504)