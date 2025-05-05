package ProjectManagement;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class ProjectController {


    // Make this class public and top-level
    @RestController
    @RequestMapping("/api/projects")
    public class ProjectController {

        @Autowired
        private ProjectService projectService;

        @GetMapping
        public List<Project> getAllProjects() {
            return projectService.getAllProjects();
        }

        @PostMapping
        public Project createProject(@RequestBody Project project) {
            return projectService.createProject(project);
        }

        @PutMapping("/{id}")
        public Project updateProject(@PathVariable String id, @RequestBody Project project) {
            return projectService.updateProject(id, project);
        }

        @PostMapping("/{id}/start")
        public Project startProject(@PathVariable String id) {
            return projectService.startProject(id);
        }
    }

}
