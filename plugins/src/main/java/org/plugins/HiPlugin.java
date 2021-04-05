package org.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
public class HiPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("LiLi Plugin");
    }
}
