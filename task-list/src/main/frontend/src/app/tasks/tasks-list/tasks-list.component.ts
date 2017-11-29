import {Component, OnInit} from '@angular/core';
import {Task} from "../task.model";

@Component({
    selector: 'app-tasks-list',
    templateUrl: './tasks-list.component.html',
    styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

    constructor() {
    }

    ngOnInit() {
        this.tasks.push(new Task(1, "new Task 1", true, "01.01.2017"));
        this.tasks.push(new Task(2, "new Task 2", false, "01.01.2017"));
        this.tasks.push(new Task(3, "new Task 3", false, "01.01.2017"));
    }


    getDueDateLabel(task: Task) {
        return task.completed ? 'label-success' : 'label-primary';
    }

    onTaskChange(event: Event, task: Task) {
        console.log('task has changed');
    }
}