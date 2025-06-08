package Minggu_15.Linked_List;

public class BinaryTree01 {
    Node01 root;

    public BinaryTree01() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa01 mahasiswa) {
        Node01 newNode = new Node01(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node01 current = root;
            Node01 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node01 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node01 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node01 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node01 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    // Method getSuccessor()
    Node01 getSuccessor(Node01 del) {
        Node01 successor = del.right;
        Node01 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    // Method delete()
    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        // cari node (current) yang akan dihapus
        Node01 parent = root;
        Node01 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            }
            // jika hanya punya 1 anak (kanan)
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }
            // jika hanya punya 1 anak (kiri)
            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }
            // jika punya 2 anak
            else {
                Node01 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }

    }

    public void addRekursif(Mahasiswa01 mhs) {
        if (root == null) {
            root = new Node01(mhs);
        } else {
            add(root, mhs); // panggil versi rekursif
        }
    }

    public void add(Node01 current, Mahasiswa01 mhs) {
        if (root == null) {
            root = new Node01(mhs);
            return;
        }

        if (mhs.ipk < current.mahasiswa.ipk) {
            if (current.left == null) {
                current.left = new Node01(mhs);
            } else {
                add(current.left, mhs); // Rekursif ke kiri
            }
        } else {
            if (current.right == null) {
                current.right = new Node01(mhs);
            } else {
                add(current.right, mhs); // Rekursif ke kanan
            }
        }
    }

    public Mahasiswa01 cariMinIPK() {
        if (isEmpty())
            return null;

        Node01 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }

    public Mahasiswa01 cariMaxIPK() {
        if (isEmpty())
            return null;

        Node01 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilIPKLebih(root, ipkBatas);
    }

    private void tampilIPKLebih(Node01 node, double ipkBatas) {
        if (node != null) {
            tampilIPKLebih(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKLebih(node.right, ipkBatas);
        }
    }

}
