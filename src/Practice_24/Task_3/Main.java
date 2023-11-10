package Practice_24.Task_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
interface IDocument {
    void open();

    void save();

    void close();
}
interface ICreateDocument {
    IDocument createNew();

    IDocument createOpen();
}
class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Text Document opened");
    }

    @Override
    public void save() {
        System.out.println("Text Document saved");
    }

    @Override
    public void close() {
        System.out.println("Text Document closed");
    }
}
class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Creating a new Text Document");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Opening an existing Text Document");
        return new TextDocument();
    }
}


public class Main extends JFrame {
    private IDocument document;
    private ICreateDocument documentFactory;

    public Main(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;

        // Create menu bar and menu items
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // Add action listeners
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewDocument();
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDocument();
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDocument();
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitApplication();
            }
        });

        // Add menu items to the file menu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        // Add file menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Set frame properties
        setTitle("Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    private void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    private void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document to save.");
        }
    }

    private void exitApplication() {
        System.exit(0);
    }

    public static void main(String[] args) {
        // For demonstration, we create a Text Document editor
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        new Main(textDocumentFactory);
    }
}
