package Practice_19.Task_2;

public class SortingStudentsByGPAController {
    private SortingStudentsByGPA model;
    private SortingStudentsByGPAView view;
    public SortingStudentsByGPAController(SortingStudentsByGPA model, SortingStudentsByGPAView view) {
        this.model = model;
        this.view = view;
    }
    public void updateView() {
        view.printArray(model.getiDNumber());
    }
}
