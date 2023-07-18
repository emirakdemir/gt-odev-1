// 2-SmartPhone için hem no args constructor hem de all args constructor yazın.
class SmartPhone extends Phone {
    private int storage;
    private int ram;
    private String camera;

    // Parametre almayan yapıcı metot
    public SmartPhone() {
        super(0, "", 0.0, "");
        this.storage = 0;
        this.ram = 0;
        this.camera = "";
    }

    // Tüm parametreleri alan yapıcı metot
    public SmartPhone(int id, String name, double price, String phoneNumber, int storage, int ram, String camera) {
        super(id, name, price, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }


    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}
