package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.internal.GtkSignalListItemFactory

class SignalListItemFactory(raw: Ptr[GtkSignalListItemFactory])
    extends ListItemFactory(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end SignalListItemFactory

object SignalListItemFactory:
  def apply(): SignalListItemFactory = new SignalListItemFactory(
    gtk_signal_list_item_factory_new().asInstanceOf
  )
end SignalListItemFactory
