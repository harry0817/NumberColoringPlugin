package com.github.harry0817.numbercoloringplugin.services

import com.intellij.openapi.project.Project
import com.github.harry0817.numbercoloringplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
