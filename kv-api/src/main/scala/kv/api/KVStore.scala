package kv.api

import scala.concurrent.Future

trait KVStore[K, V] {
  def set(key: K, value: V): Future[Boolean]

  def get(key: K): Future[Option[V]]
}
