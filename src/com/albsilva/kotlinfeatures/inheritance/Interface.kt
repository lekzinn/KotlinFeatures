package com.albsilva.kotlinfeatures.inheritance

interface A {
    fun foo()
    fun bar(){
        println("Print bar(A)")
    }

    val prop: Int

    val propWithImplementation: String
        get() = "propWithImplementation"
}

interface B{
    fun foo() { println("Print foo(B)")}
    fun bar() {println("Print bar(B)")}
}

class C : A{
    override val prop: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun foo() {
        println("Print foo(C)")
    }

}

class D : A,B{
    override val prop: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun foo() {
        super.foo()
    }

    override fun bar() {
        super<A>.bar()
    }

}

fun main(args: Array<String>) {
//    val c = C()
//
//    c.foo()
//    c.bar()

    val d = D()
    d.foo()
    d.bar()
}