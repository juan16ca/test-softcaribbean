package com.softcaribbean.apiclients.models.entity;

import org.springframework.stereotype.Component;

@Component
public class Node {

    private Client client;

    private Node nodeLeft;
    private Node nodeRight;

    public Node() {

    }

    public Node(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Node getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }

    public void add(Client client) {

        if (client.getIdentificationNumber() < this.client.getIdentificationNumber()) {
            if (nodeLeft != null) {

                nodeLeft.add(client);
            } else {
                nodeLeft = new Node(client);

            }
        } else {
            if (nodeRight != null) {
                nodeRight.add(client);

            } else {
                nodeRight = new Node(client);

            }
        }

    }

    public Client find(Node node, int identificationNumber) {

        if (node != null) {
            if (node.getClient().getIdentificationNumber() == identificationNumber) {
                return node.getClient();
            } else if (identificationNumber < node.getClient().getIdentificationNumber()) {               
                return find(node.nodeLeft, identificationNumber);
            } else {
                return find(node.nodeRight, identificationNumber);
            }
        }else{
            return null;
        }

    }
}
