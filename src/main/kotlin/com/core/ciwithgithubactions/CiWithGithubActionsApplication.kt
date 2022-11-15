package com.core.ciwithgithubactions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiWithGithubActionsApplication

fun main(args: Array<String>) {
	runApplication<CiWithGithubActionsApplication>(*args)
}
