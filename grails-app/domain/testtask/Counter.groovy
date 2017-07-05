package testtask

class Counter {
    String name
    Integer value = 0

    static constraints = {
        name blank: true, size: 1..20
    }

    static mapping = {
        version false
        id generator: 'assigned', name: 'name'
    }
}
