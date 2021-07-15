package com.github.eurphen.plugintemplatetest.services

import com.github.eurphen.plugintemplatetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
