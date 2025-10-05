

package org.mukesh

class JenkinsHello implements Serializable {
    def steps

    JenkinsHello(steps) {
        this.steps = steps
    }

    void sayHelloJenkins() {
        steps.echo "Hello Jenkins"
    }
}

