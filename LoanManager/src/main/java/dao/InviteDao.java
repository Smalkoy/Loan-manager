package dao;

import model.Invite;

import java.util.List;

public interface InviteDao {

    Invite findById(int inviteId);

    List<Invite> findAllByInviter(int userInviterId);

    List<Invite> findAllByTarget(int userTargetId);
}
