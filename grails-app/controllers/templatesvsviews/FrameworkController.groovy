package templatesvsviews

class FrameworkController {

    def index() { }

    def testtemplate(){
        render template:'showtemplate'
    }

    def testview(){
        render view: 'showview'
    }

    def testview1(){
        render view: 'showview1'
    }
}
