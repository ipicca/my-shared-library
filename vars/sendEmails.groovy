echo "test sendEmails"

def sendEmails(String CLIENTE, String JOB_NAME, String BUILD_NUMBER, String MAILS) {
    emailext subject: "${CLIENTE} ERROR - ${JOB_NAME}-${BUILD_NUMBER}",
              body: "<html><body><p style='color:red;'>El pipeline ${JOB_NAME} ha fallado. Revisar la consola de Jenkins para más detalles.</p></body></html>",
              mimeType: 'text/html',
              to: "${MAILS}",
              attachLog: true
}