package bindgen.docs

import subatomic.builders.librarysite.*
import subatomic.builders.*
import subatomic.*
import java.time.LocalDate
import subatomic.builders.Tracker.GoogleAnalytics

def currentYear = LocalDate.now().getYear()

object Docs extends LibrarySite.App:
  def config =
    LibrarySite(
      name = "gtk-sn",
      contentRoot = os.pwd / "pages",
      tagline = Some("Gtk for Scala 3 Native"),
      assetsRoot = Some(os.pwd / "assets"),
      copyright = Some(s"© 2023-$currentYear Anton Sviridov"),
      githubUrl = Some("https://github.com/indoorvivants/gtk-sn"),
      trackers = Seq(GoogleAnalytics("G-2V7BY56Z37")),
      highlighting = SyntaxHighlighting.HighlightJS.default
        .copy(
          languages = List("scala", "c", "dockerfile"),
          theme = "atom-one-dark"
        )
    )
  override def extra(site: Site[LibrarySite.Doc]) =
    site
      .addCopyOf(SiteRoot / "CNAME", os.pwd / "assets" / "CNAME")
end Docs
