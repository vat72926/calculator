class ToDoApp:
    def __init__(self):
        self.tasks = []

    def add_task(self, task: str):
        self.tasks.append(task)
        print(f"Added task: '{task}'")

    def remove_task(self, index: int):
        if 0 <= index < len(self.tasks):
            removed = self.tasks.pop(index)
            print(f"Removed task: '{removed}'")
        else:
            print("Invalid index")

    def list_tasks(self):
        if not self.tasks:
            print("No tasks available.")
        else:
            print("To-Do List:")
            for i, task in enumerate(self.tasks):
                print(f"{i + 1}. {task}")

if __name__ == "__main__":
    app = ToDoApp()
    app.add_task("Buy groceries")
    app.add_task("Call Alice")
    app.add_task("Finish project")
    app.list_tasks()
    app.remove_task(1)
    app.list_tasks()
