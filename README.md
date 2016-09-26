# Template to start your ScalaJS application

Initialize:
* ``__install.cmd`` (install node packages, python packages, and sbt)

Includes:
* sbt (compiles Scala to JS)
* webpack (bundles all together)
* watch (helps keep all things compiled all the time
* intellij project (so you can benefit from auto-completion)
* babel & typescript (when you need some plumbing)
* stylus (opinionated choice for css replacement)

Libraries:
* bootstrap
* jquery

Scripts:
* ``npm run scalajs`` (runs sbt once)
* ``npm run webpack`` (runs webpack once)
* ``npm run build`` (runs gradle and webpack once)
* ``npm run release`` (runs gradle and webpack in release mode once)
* ``npm run serve`` (server output folder)
* ``watch`` (runs webpack, http server and gradle in watch mode)

Renaming (files that contain project name):
* ``package.json``
* ``build.sbt``
* ``src/html/index.html``

Renaming (if you intend to use IntelliJ)
* ``.idea/.name ``
* ``.idea/modules.xml``
* ``.idea/modules/*.iml``

Note: you can delete .idea folder and the open project from IntelliJ with "Import project..." command, it will hopefully recreat all the files