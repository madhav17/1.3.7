class RemotePaginationGrailsPlugin {
    // the plugin version
    def version = "0.2.5"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def author = "Amit Jain"
    def authorEmail = "amit@intelligrape.com"
    def title = "Remote Pagination Plugin"
    def description = '''
   Remote-Pagination plugin provides tags for pagination and to sort columns without page refresh, using ajax and loads only the list of objects needed. It supports multiple paginations as well. More than one remotePaginate and remoteSortableColumn can be used.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/RemotePagination+Plugin"

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
