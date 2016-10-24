package toporynskyi.javamee.core.collections.treeee3.persistence;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class XmlSerializer<T> {
    public static void main(String[] args) {
        XmlSerializer<Integer> xmlSerializer = new XmlSerializer<>();

        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.root = new BinaryNode<>(1);
        tree.root.leftChild = new BinaryNode<>(2);
        tree.root.rightChild = new BinaryNode<>(3);
        tree.root.leftChild.leftChild = new BinaryNode<>(4);

        xmlSerializer.save("/tmp/jaxb/simple.xml", tree);

        BinaryTree loaded = xmlSerializer.load("/tmp/jaxb/simple.xml");
        System.out.println(loaded);
    }

    public  void save(String path, BinaryTree<T> tree){
        try {
            BinaryNode<T> root = tree.root;
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(BinaryNode.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "");

            jaxbMarshaller.marshal(root, file);
            jaxbMarshaller.marshal(root, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public BinaryTree<T> load(String path){
        BinaryTree<T> tree = new BinaryTree<>();
        try {

            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(BinaryNode.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            @SuppressWarnings("unchecked")
            BinaryNode<T> root = (BinaryNode<T>) jaxbUnmarshaller.unmarshal(file);
            System.out.println(root);
            tree.root = root;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return tree;
    }
}
