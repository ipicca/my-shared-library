def sendEmails(String cliente, String jobName, String buildNumber, String mails) {
    emailext subject: "${cliente} ERROR - ${jobName}-${buildNumber}",
              body: "<html><body><p style='color:red;'>El pipeline ${jobName} ha fallado. Revisar la consola de Jenkins para más detalles.</p></body></html>",
              mimeType: 'text/html',
              to: "${mails}",
              attachLog: true
}