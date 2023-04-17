package tasks.Lesson_08.Ex006.Interface;

import tasks.Lesson_08.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
