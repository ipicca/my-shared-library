def call(path, target, args) {
    println "RUN: ROBOCOPY ${path} ${target} ${args}"
    // robocopy uses non-zero exit code even on success, status below 3 is fine
    def status = bat returnStatus: true, script: "ROBOCOPY ${path} ${target} ${args}"
    println "ROBOCOPY returned ${status}"
    if (status < 0 || status > 3) {
        error("ROBOCOPY failed")
    }
}