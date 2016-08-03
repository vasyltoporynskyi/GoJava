package core.collections.treeee3.persistence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by SUSTAVOV on 27.07.2016.
 */
@XmlRootElement(name = "node")
@XmlAccessorType(XmlAccessType.FIELD)
public class BinaryNode<T> implements Serializable
{
    @XmlElement(name = "data")
    private T data;
    @XmlElement(name = "left")
    public BinaryNode<T> leftChild;
    @XmlElement(name = "right")
    public BinaryNode<T> rightChild;

    public BinaryNode() {
    }

    public BinaryNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
